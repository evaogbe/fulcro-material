(ns ogbe.fulcro.mui.icons.toc-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TocOutlined" :default TocOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toc-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TocOutlined)))