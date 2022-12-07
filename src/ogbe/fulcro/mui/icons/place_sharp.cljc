(ns ogbe.fulcro.mui.icons.place-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PlaceSharp" :default PlaceSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-place-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaceSharp)))