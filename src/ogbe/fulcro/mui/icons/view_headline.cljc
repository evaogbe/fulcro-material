(ns ogbe.fulcro.mui.icons.view-headline
  #?(:cljs (:require
            ["@mui/icons-material/ViewHeadline" :default ViewHeadline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-headline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewHeadline)))