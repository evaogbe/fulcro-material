(ns ogbe.fulcro.mui.icons.style-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StyleOutlined" :default StyleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-style-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StyleOutlined)))