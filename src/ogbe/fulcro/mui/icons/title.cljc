(ns ogbe.fulcro.mui.icons.title
  #?(:cljs (:require
            ["@mui/icons-material/Title" :default Title]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-title
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Title)))