(ns ogbe.fulcro.mui.icons.view-comfy
  #?(:cljs (:require
            ["@mui/icons-material/ViewComfy" :default ViewComfy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-comfy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewComfy)))