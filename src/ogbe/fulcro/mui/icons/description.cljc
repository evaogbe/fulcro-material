(ns ogbe.fulcro.mui.icons.description
  #?(:cljs (:require
            ["@mui/icons-material/Description" :default Description]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-description
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Description)))