(ns ogbe.fulcro.mui.icons.door-sliding
  #?(:cljs (:require
            ["@mui/icons-material/DoorSliding" :default DoorSliding]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-door-sliding
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoorSliding)))