(ns ogbe.fulcro.mui.icons.border-bottom
  #?(:cljs (:require
            ["@mui/icons-material/BorderBottom" :default BorderBottom]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-bottom
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderBottom)))