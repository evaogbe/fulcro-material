(ns ogbe.fulcro.mui.icons.source-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SourceRounded" :default SourceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-source-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SourceRounded)))