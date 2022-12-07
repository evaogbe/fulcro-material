(ns ogbe.fulcro.mui.icons.web-stories
  #?(:cljs (:require
            ["@mui/icons-material/WebStories" :default WebStories]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-stories
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebStories)))