(ns ogbe.fulcro.mui.icons.cast-connected
  #?(:cljs (:require
            ["@mui/icons-material/CastConnected" :default CastConnected]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cast-connected
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CastConnected)))