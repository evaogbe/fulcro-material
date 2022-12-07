(ns ogbe.fulcro.mui.icons.check-box
  #?(:cljs (:require
            ["@mui/icons-material/CheckBox" :default CheckBox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-box
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckBox)))