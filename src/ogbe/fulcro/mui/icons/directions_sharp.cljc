(ns ogbe.fulcro.mui.icons.directions-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsSharp" :default DirectionsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsSharp)))