(ns ogbe.fulcro.mui.icons.toc-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TocTwoTone" :default TocTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toc-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TocTwoTone)))