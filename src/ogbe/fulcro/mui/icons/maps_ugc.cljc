(ns ogbe.fulcro.mui.icons.maps-ugc
  #?(:cljs (:require
            ["@mui/icons-material/MapsUgc" :default MapsUgc]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-maps-ugc
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MapsUgc)))