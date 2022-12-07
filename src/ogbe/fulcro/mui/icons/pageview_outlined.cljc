(ns ogbe.fulcro.mui.icons.pageview-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PageviewOutlined" :default PageviewOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pageview-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PageviewOutlined)))