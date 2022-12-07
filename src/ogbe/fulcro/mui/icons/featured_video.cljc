(ns ogbe.fulcro.mui.icons.featured-video
  #?(:cljs (:require
            ["@mui/icons-material/FeaturedVideo" :default FeaturedVideo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-featured-video
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeaturedVideo)))