(ns ogbe.fulcro.mui.icons.tour-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TourRounded" :default TourRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tour-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TourRounded)))