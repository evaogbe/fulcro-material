(ns ogbe.fulcro.mui.icons.domain
  #?(:cljs (:require
            ["@mui/icons-material/Domain" :default Domain]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-domain
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Domain)))