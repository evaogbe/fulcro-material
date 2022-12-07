(ns ogbe.fulcro.mui.icons.check-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CheckTwoTone" :default CheckTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckTwoTone)))