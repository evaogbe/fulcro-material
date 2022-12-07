(ns ogbe.fulcro.mui.icons.person-search
  #?(:cljs (:require
            ["@mui/icons-material/PersonSearch" :default PersonSearch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-search
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonSearch)))