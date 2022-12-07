(ns ogbe.fulcro.mui.icons.explore-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ExploreRounded" :default ExploreRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-explore-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExploreRounded)))