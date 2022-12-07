(ns ogbe.fulcro.mui.icons.web-stories-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WebStoriesRounded" :default WebStoriesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-stories-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebStoriesRounded)))