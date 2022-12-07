(ns ogbe.fulcro.mui.icons.directions-bus
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsBus" :default DirectionsBus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-bus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsBus)))