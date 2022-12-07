(ns ogbe.fulcro.mui.icons.public-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PublicOutlined" :default PublicOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-public-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PublicOutlined)))