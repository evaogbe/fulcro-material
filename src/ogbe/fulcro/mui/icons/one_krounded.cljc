(ns ogbe.fulcro.mui.icons.one-krounded
  #?(:cljs (:require
            ["@mui/icons-material/OneKRounded" :default OneKRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-one-krounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OneKRounded)))