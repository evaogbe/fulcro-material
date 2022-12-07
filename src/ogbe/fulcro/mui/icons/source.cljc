(ns ogbe.fulcro.mui.icons.source
  #?(:cljs (:require
            ["@mui/icons-material/Source" :default Source]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-source
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Source)))