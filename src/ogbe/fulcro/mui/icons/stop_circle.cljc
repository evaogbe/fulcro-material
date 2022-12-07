(ns ogbe.fulcro.mui.icons.stop-circle
  #?(:cljs (:require
            ["@mui/icons-material/StopCircle" :default StopCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stop-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StopCircle)))