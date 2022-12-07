(ns ogbe.fulcro.mui.icons.auto-stories-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AutoStoriesOutlined" :default AutoStoriesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-stories-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoStoriesOutlined)))