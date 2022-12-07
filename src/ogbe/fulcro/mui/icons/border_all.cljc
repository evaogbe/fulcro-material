(ns ogbe.fulcro.mui.icons.border-all
  #?(:cljs (:require
            ["@mui/icons-material/BorderAll" :default BorderAll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-all
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderAll)))