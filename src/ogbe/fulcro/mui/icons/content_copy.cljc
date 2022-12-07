(ns ogbe.fulcro.mui.icons.content-copy
  #?(:cljs (:require
            ["@mui/icons-material/ContentCopy" :default ContentCopy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-content-copy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContentCopy)))