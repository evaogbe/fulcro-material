(ns ogbe.fulcro.mui.icons.web-stories-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WebStoriesOutlined" :default WebStoriesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-stories-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebStoriesOutlined)))