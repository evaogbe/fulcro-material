(ns ogbe.fulcro.mui.icons.drafts
  #?(:cljs (:require
            ["@mui/icons-material/Drafts" :default Drafts]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drafts
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Drafts)))