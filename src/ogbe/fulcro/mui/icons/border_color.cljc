(ns ogbe.fulcro.mui.icons.border-color
  #?(:cljs (:require
            ["@mui/icons-material/BorderColor" :default BorderColor]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-color
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderColor)))