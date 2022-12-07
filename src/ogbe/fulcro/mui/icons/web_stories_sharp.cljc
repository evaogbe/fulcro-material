(ns ogbe.fulcro.mui.icons.web-stories-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WebStoriesSharp" :default WebStoriesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-stories-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebStoriesSharp)))