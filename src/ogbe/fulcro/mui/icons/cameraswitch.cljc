(ns ogbe.fulcro.mui.icons.cameraswitch
  #?(:cljs (:require
            ["@mui/icons-material/Cameraswitch" :default Cameraswitch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cameraswitch
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cameraswitch)))