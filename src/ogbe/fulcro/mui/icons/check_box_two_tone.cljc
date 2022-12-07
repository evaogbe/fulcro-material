(ns ogbe.fulcro.mui.icons.check-box-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CheckBoxTwoTone" :default CheckBoxTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-box-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckBoxTwoTone)))