(ns ogbe.fulcro.mui.icons.sort-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SortTwoTone" :default SortTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sort-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SortTwoTone)))