(ns ogbe.fulcro.mui.icons.place-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PlaceRounded" :default PlaceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-place-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaceRounded)))