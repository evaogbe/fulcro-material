(ns ogbe.fulcro.mui.icons.pages-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PagesOutlined" :default PagesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pages-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PagesOutlined)))