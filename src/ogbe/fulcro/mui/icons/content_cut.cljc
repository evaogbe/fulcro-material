(ns ogbe.fulcro.mui.icons.content-cut
  #?(:cljs (:require
            ["@mui/icons-material/ContentCut" :default ContentCut]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-content-cut
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContentCut)))