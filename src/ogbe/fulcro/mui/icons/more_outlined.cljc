(ns ogbe.fulcro.mui.icons.more-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MoreOutlined" :default MoreOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-more-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoreOutlined)))