(ns ogbe.fulcro.mui.icons.border-right
  #?(:cljs (:require
            ["@mui/icons-material/BorderRight" :default BorderRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderRight)))