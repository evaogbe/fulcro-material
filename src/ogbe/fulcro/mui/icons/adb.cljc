(ns ogbe.fulcro.mui.icons.adb
  #?(:cljs (:require
            ["@mui/icons-material/Adb" :default Adb]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-adb
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Adb)))