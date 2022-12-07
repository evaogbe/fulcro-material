(ns ogbe.fulcro.mui.icons.podcasts-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PodcastsRounded" :default PodcastsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-podcasts-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PodcastsRounded)))