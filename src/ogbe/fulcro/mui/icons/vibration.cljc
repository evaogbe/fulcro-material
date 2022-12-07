(ns ogbe.fulcro.mui.icons.vibration
  #?(:cljs (:require
            ["@mui/icons-material/Vibration" :default Vibration]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vibration
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Vibration)))