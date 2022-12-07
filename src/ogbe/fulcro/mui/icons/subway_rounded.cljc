(ns ogbe.fulcro.mui.icons.subway-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SubwayRounded" :default SubwayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-subway-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SubwayRounded)))