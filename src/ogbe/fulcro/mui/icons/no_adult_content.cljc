(ns ogbe.fulcro.mui.icons.no-adult-content
  #?(:cljs (:require
            ["@mui/icons-material/NoAdultContent" :default NoAdultContent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-adult-content
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoAdultContent)))