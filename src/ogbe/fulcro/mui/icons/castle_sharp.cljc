(ns ogbe.fulcro.mui.icons.castle-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CastleSharp" :default CastleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-castle-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CastleSharp)))