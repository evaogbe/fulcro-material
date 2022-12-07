(ns ogbe.fulcro.mui.icons.podcasts
  #?(:cljs (:require
            ["@mui/icons-material/Podcasts" :default Podcasts]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-podcasts
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Podcasts)))