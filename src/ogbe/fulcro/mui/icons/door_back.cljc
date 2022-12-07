(ns ogbe.fulcro.mui.icons.door-back
  #?(:cljs (:require
            ["@mui/icons-material/DoorBack" :default DoorBack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-door-back
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoorBack)))