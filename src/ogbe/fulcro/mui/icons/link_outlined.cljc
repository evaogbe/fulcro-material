(ns ogbe.fulcro.mui.icons.link-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LinkOutlined" :default LinkOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-link-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LinkOutlined)))