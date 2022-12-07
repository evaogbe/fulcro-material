(ns ogbe.fulcro.mui.icons.door-front
  #?(:cljs (:require
            ["@mui/icons-material/DoorFront" :default DoorFront]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-door-front
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoorFront)))