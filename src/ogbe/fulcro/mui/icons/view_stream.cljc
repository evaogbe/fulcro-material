(ns ogbe.fulcro.mui.icons.view-stream
  #?(:cljs (:require
            ["@mui/icons-material/ViewStream" :default ViewStream]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-stream
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewStream)))